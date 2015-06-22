package com.trifork.mesos;

import hudson.Extension;
import hudson.views.ViewsTabBar;
import hudson.views.ViewsTabBarDescriptor;
import net.sf.json.JSONObject;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.StaplerRequest;

/**
 * Created by bamo on 21/06/15.
 */
public class CustomViewsTabBar extends ViewsTabBar {

    @DataBoundConstructor
    public CustomViewsTabBar() {
        super();
    }

    @Extension
    public static final class CustomViewsTabBarDescriptor extends ViewsTabBarDescriptor {

        public CustomViewsTabBarDescriptor() {
            load();
        }

        @Override
        public String getDisplayName() {
            return "Custom Views TabBar";
        }

        @Override
        public boolean configure(StaplerRequest req, JSONObject formData) throws FormException {
            save();
            return false;
        }
    }
}
