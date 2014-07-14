package com.test.login;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.EventHandler;
import java.lang.String;
import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.event.shared.HandlerRegistration;

public class AddUsersEvent extends GwtEvent<AddUsersEvent.AddUsersHandler> {

	public static Type<AddUsersHandler> TYPE = new Type<AddUsersHandler>();
	private String addUser;

	public interface AddUsersHandler extends EventHandler {
		void onAddUsers(AddUsersEvent event);
	}

	public interface AddUsersHasHandlers extends HasHandlers {
		HandlerRegistration addAddUsersHandler(AddUsersHandler handler);
	}

	public AddUsersEvent(String addUser) {
		this.addUser = addUser;
	}

	public String getAddUser() {
		return addUser;
	}

	@Override
	protected void dispatch(AddUsersHandler handler) {
		handler.onAddUsers(this);
	}

	@Override
	public Type<AddUsersHandler> getAssociatedType() {
		return TYPE;
	}

	public static Type<AddUsersHandler> getType() {
		return TYPE;
	}

	public static void fire(HasHandlers source, String addUser) {
		source.fireEvent(new AddUsersEvent(addUser));
	}
}
