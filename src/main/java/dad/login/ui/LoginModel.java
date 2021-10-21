package dad.login.ui;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class LoginModel {

	private StringProperty user = new SimpleStringProperty();
	private StringProperty password = new SimpleStringProperty();
	private BooleanProperty ldap = new SimpleBooleanProperty();
	
	
	public final StringProperty userProperty() {
		return this.user;
	}
	
	public final String getUser() {
		return this.userProperty().get();
	}
	
	public final void setUser(final String user) {
		this.userProperty().set(user);
	}
	
	public final StringProperty passwordProperty() {
		return this.password;
	}
	
	public final String getPassword() {
		return this.passwordProperty().get();
	}
	
	public final void setPassword(final String password) {
		this.passwordProperty().set(password);
	}

	public final BooleanProperty ldapProperty() {
		return this.ldap;
	}
	

	public final boolean isLdap() {
		return this.ldapProperty().get();
	}
	

	public final void setLdap(final boolean ldap) {
		this.ldapProperty().set(ldap);
	}
	
	
	
	
}
