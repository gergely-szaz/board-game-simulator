package graphics;

import hu.gergelyszaz.bgs.state.PlayerState;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * Created by mad on 2016. 03. 31..
 */
public class PlayerInfoPanel extends JPanel {
	public PlayerInfoPanel() {
		add(new JLabel("test"));
		setBackground(Color.ORANGE);
	}

	public void UpdatePlayersState(List<PlayerState> players) {
	}
}
