package br.com.rafael.creational_patterns.singleton.ex03;

public final class RemoteConnection { //No children of this class for you!
    private Connect con;
    private final static RemoteConnection rc = new RemoteConnection();

    private RemoteConnection() { //No multiple objects of this class for you.
        this.con = new Connect();
    }

    public static RemoteConnection getRemoteConnection() {
        return rc;
    }

    public void setConnection(Connect newCon) { //You can only change the attribute 'con' of the unique instance.
        this.con = newCon;
    }
}
