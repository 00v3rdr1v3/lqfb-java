package org.lqfb.ui.vaadin;

import com.vaadin.Application;
import com.vaadin.ui.Window;

@SuppressWarnings("serial")
public class LqfbUiVaadinApplication extends Application {

    @Override
    public void init() {
        final Window mainWindow = new Window();

        MemberView memberView = new MemberView();

        mainWindow.addComponent(memberView);
        setMainWindow(mainWindow);

    }

}
