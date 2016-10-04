package hu.bme.aut.gergelyszaz.BGS.client;

import org.glassfish.tyrus.client.ClientManager;
import org.json.JSONObject;

import javax.websocket.DeploymentException;
import javax.websocket.Session;
import java.net.ConnectException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by mad on 2016. 10. 04..
 */
public class Connection {
    private Session session;
    private List<MessageListener> messageListeners = new ArrayList<>();
    private static ConcurrentHashMap<String, Connection> connections = new ConcurrentHashMap<>();
    private String address;

    public Connection(String address) {
        this.address = address;
    }

    public void open() throws ConnectException {
        try {

            URI uri = new URI(address);
            ClientManager client = ClientManager.createClient();
            session = client.connectToServer(BGSClient.class, uri);
            connections.put(session.getId(), this);

        } catch (URISyntaxException | DeploymentException e) {
            throw new ConnectException("Couldn't connect to " + address);
        }
    }

    public void addMessageListener(MessageListener messageListener) {
        messageListeners.add(messageListener);
    }

    public void removeMessageListener(MessageListener messageListener) {
        messageListeners.remove(messageListener);
    }

    public void close() {

        synchronized (session) {
            JSONObject message = new JSONObject().put("action", "quit");
            sendMessage(message);
        }

    }

    public void sendSelected(int id) {
        JSONObject message = new JSONObject().put("action", "select").put("parameter", id);
        sendMessage(message);
    }

    public void sendJoinGame(String gameId) {
        JSONObject message = new JSONObject().put("action", "join").put("parameter", gameId);
        sendMessage(message);

    }

    public void sendRequestServerInfo() {
        JSONObject message = new JSONObject().put("action", "info");
        sendMessage(message);
    }

    private void sendMessage(JSONObject obj) {
        synchronized (session) {
            session.getAsyncRemote().sendText(obj.toString());
        }
    }

    static void processMessage(String id, String message) {
        connections.get(id).processMessage(message);
    }

    private void processMessage(String message) {
        JSONObject obj = new JSONObject(message);
        for (MessageListener messageListener : messageListeners) {
            messageListener.RecieveMessage(obj);
        }
    }

}
