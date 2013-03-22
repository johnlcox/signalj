package com.leacox.signalj.transport;

import com.leacox.signalj.SignalJConnection;

public interface Transport {
	public void negotiate(SignalJConnection connection);

	public void start(SignalJConnection connection, String data);

	public void send(SignalJConnection connection, String data);

	public void abort(SignalJConnection connection);
}
