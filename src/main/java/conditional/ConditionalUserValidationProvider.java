package conditional;

import org.keycloak.authentication.AuthenticationFlowContext;
import org.keycloak.authentication.authenticators.conditional.ConditionalAuthenticator;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.RealmModel;
import org.keycloak.models.UserModel;

public class ConditionalUserValidationProvider implements ConditionalAuthenticator {
    public static final ConditionalUserValidationProvider SINGLETON = new ConditionalUserValidationProvider();

    @Override
    public boolean matchCondition(AuthenticationFlowContext context) {
        return context.getUser() == null;
    }

    @Override
    public void action(AuthenticationFlowContext context) {
        // no op
    }

    @Override
    public boolean requiresUser() {
        return true;
    }

    @Override
    public void setRequiredActions(KeycloakSession session, RealmModel realm, UserModel user) {
        // no op
    }

    @Override
    public void close() {

    }
}
