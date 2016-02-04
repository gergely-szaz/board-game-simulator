package hu.bme.aut.gergelyszaz.BGS.server;
 
import java.io.IOException;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.websocket.CloseReason;
import javax.websocket.CloseReason.CloseCodes;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.json.JSONArray;
import org.json.JSONObject;

import hu.bme.aut.gergelyszaz.BGS.server.GameStateToJson;
import hu.bme.aut.gergelyszaz.BGS.core.GameManager;
import hu.bme.aut.gergelyszaz.BGS.core.IController;
import hu.bme.aut.gergelyszaz.BGS.core.IView;
import hu.bme.aut.gergelyszaz.BGS.state.GameState;
 
@ServerEndpoint(value = "/game")
public class BGSServer implements IView{
 
	@Inject
	private GameManager gm=GameManager.getInstance();
    private Logger logger = Logger.getLogger(this.getClass().getName());
 
    @OnOpen
    public void onOpen(Session session) {
    	logger.info("Connected ... " + session.getId());
    }
 
    
    @OnMessage
    public String onMessage(String message, Session session) {
    	final JSONObject obj = new JSONObject(message);
    	String action=obj.getString("action");
    	JSONObject ret=new JSONObject();
        switch (action) {
        case "join":
        	String gameName=obj.getString("gameName");
        	try {
        		logger.info(session.getId());
        		IController c=gm.JoinGame(session.getId(),gameName);
        		c.AddView(this);
        		session.getUserProperties().put("game", c);
        		return ret.put("status", "Joined").toString();
			} catch (Exception e) {
				logger.info(e.getMessage());
				return ret.put("error", e.getMessage()).toString();
			}
        case "update":
        	//TODO error if there is no game yet
        	IController c=(IController)session.getUserProperties().get("game");
        	GameState gs=c.getCurrentState(session.getId());
        	return GameStateToJson.JSONify(gs).toString();
        case "info":
        	ret.put("runningGames", gm.runningGames.size());
        	JSONArray games = new JSONArray();
        	ret.put("availableGames",gm.availableGames.size());
        	ret.put("playerConnections",gm.playerConnections.size());
        	for(String g:gm.mm.AvailableModels())
        	{
        		games.put(new JSONObject().put("name", g));
        	}
        	ret.put("models", games);
        	return ret.toString();
        case "quit":
            logger.info("Quitting the game");
            try {
                session.close(new CloseReason(CloseCodes.NORMAL_CLOSURE, "Game finished"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
		return ret.put("error", "No Action").toString();
    }
 
    @OnClose
    public void onClose(Session session, CloseReason closeReason) {
        logger.info(String.format("Session %s closed because of %s", session.getId(), closeReason));
    }


	@Override
	public void SetController(IController controller) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void Refresh() {
		// TODO Auto-generated method stub
		
	}
 
}