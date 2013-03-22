package com.leacox.signalj;

public interface SignalJConnectionListener {
	public void onConnect(String connectionToken);

	public void onMessage(String message);

	public void onDisconnect();
}
