package com.leacox.signalj.transport.longpolling;

import org.apache.http.client.HttpClient;

import com.leacox.signalj.SignalJConnection;
import com.leacox.signalj.transport.Transport;

public class LongPollingTransport implements Transport {
	public final HttpClient httpClient;

	public LongPollingTransport(HttpClient httpClient) {
		if (httpClient == null) {
			throw new NullPointerException("httpClient: null");
		}

		this.httpClient = httpClient;
	}

	public void negotiate(SignalJConnection connection) {
		// TODO Auto-generated method stub

	}

	public void start(SignalJConnection connection, String data) {
		// TODO Auto-generated method stub

	}

	public void send(SignalJConnection connection, String data) {
		// TODO Auto-generated method stub

	}

	public void abort(SignalJConnection connection) {
		// TODO Auto-generated method stub

	}

}
