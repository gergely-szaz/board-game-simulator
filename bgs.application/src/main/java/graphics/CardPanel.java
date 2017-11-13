package graphics;

import hu.gergelyszaz.bgs.client.StateListener;
import hu.gergelyszaz.bgs.state.CardState;
import hu.gergelyszaz.bgs.state.DeckState;
import hu.gergelyszaz.bgs.state.GameState;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;

/**
 * Created by mad on 2016. 04. 13..
 */
public class CardPanel extends JPanel implements StateListener {
	HashMap<Integer, DefaultListModel> deckListModels = new HashMap<>();

	DefaultListModel<String> selectableCardsModel = new DefaultListModel<>();
	MessageListener client;

	public CardPanel() {
		JList<String> cardlist = new JList<>();
		this.add(new JLabel("Selectables: "));
		cardlist.setModel(selectableCardsModel);
		cardlist.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				if (cardlist.getModel().getSize() < 1) return;
				client.getClient().sendSelected(Integer.parseInt(cardlist.getSelectedValue()));
			}
		});
		this.add(new JScrollPane(cardlist));
	}

	public void setMessageReciever(MessageListener c) {
		client = c;
	}

	@Override
	public void UpdateGameState(GameState state) {

		for (DeckState ds : state.decks) {

			if (!deckListModels.containsKey(ds.id)) {
				DefaultListModel<String> dsm = new DefaultListModel<>();
				deckListModels.put(ds.id, dsm);
				JScrollPane scrollPane = new JScrollPane(new JList<>(dsm));

				scrollPane.setMinimumSize(new Dimension(100, 100));

				add(scrollPane);
			}

			DefaultListModel cardsModel = deckListModels.get(ds.id);
			cardsModel.clear();
			for (CardState cs : ds.cards) {
				String text = cs.id + ": " + cs.type;
				if (!cardsModel.contains(text)) {
					cardsModel.addElement(text);
				}
			}
		}

		selectableCardsModel.clear();
		if (state.currentplayer == state.playerID) {
			for (int id : state.selectables) {
				selectableCardsModel.addElement(id + "");
			}
		}
		this.repaint();
	}
}
