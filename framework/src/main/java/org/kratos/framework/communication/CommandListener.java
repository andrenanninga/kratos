package org.kratos.framework.communication;

/**
 * Created by FakeYou on 3/29/14.
 */
public interface CommandListener {
    public boolean active = true;
    public void trigger(Communication.status status, String response);
}
