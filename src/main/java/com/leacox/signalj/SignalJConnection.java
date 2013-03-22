package com.leacox.signalj;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;

import com.leacox.signalj.transport.Transport;
import com.leacox.signalj.transport.longpolling.LongPollingTransport;

public class SignalJConnection {
	private final String url;
	private final HttpClient httpClient;
	private final Transport transport;

	private SignalJConnectionState connectionState = SignalJConnectionState.DISCONNECTED;
	private String connectionId;
	private String connectionToken;
	private String messageId;

	public SignalJConnection(String url) {
		if (url == null) {
			throw new NullPointerException("url: null");
		}

		this.url = url;
		this.httpClient = new DefaultHttpClient();
		this.transport = new LongPollingTransport(httpClient);
	}

	public SignalJConnection(String url, HttpClient httpClient) {
		if (url == null) {
			throw new NullPointerException("url: null");
		}
		if (httpClient == null) {
			throw new NullPointerException("httpClient: null");
		}

		this.url = url;
		this.httpClient = httpClient;
		this.transport = new LongPollingTransport(httpClient);
	}

	public void start() {
	}

	public void stop() {
	}

	public void send(String message) {
	}

	private void changeState(SignalJConnectionState oldState, SignalJConnectionState newState) {
		connectionState = newState;
	}
}
