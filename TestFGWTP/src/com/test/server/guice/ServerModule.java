package com.test.server.guice;

import com.gwtplatform.dispatch.server.guice.HandlerModule;
import com.test.shared.SendTextToServer;
import com.test.server.SendTextToServerActionHandler;

public class ServerModule extends HandlerModule {

	@Override
	protected void configureHandlers() {

		bindHandler(SendTextToServer.class, SendTextToServerActionHandler.class);
	}
}
