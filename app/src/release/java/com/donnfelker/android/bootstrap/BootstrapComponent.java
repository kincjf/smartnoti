package com.mobilitylab.smartnoti;

import com.mobilitylab.smartnoti.authenticator.BootstrapAuthenticatorActivity;
import com.mobilitylab.smartnoti.core.TimerService;
import com.mobilitylab.smartnoti.ui.BootstrapActivity;
import com.mobilitylab.smartnoti.ui.BootstrapFragmentActivity;
import com.mobilitylab.smartnoti.ui.BootstrapTimerActivity;
import com.mobilitylab.smartnoti.ui.CheckInsListFragment;
import com.mobilitylab.smartnoti.ui.MainActivity;
import com.mobilitylab.smartnoti.ui.NavigationDrawerFragment;
import com.mobilitylab.smartnoti.ui.NewsActivity;
import com.mobilitylab.smartnoti.ui.NewsListFragment;
import com.mobilitylab.smartnoti.ui.UserActivity;
import com.mobilitylab.smartnoti.ui.UserListFragment;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
        modules = {
                AndroidModule.class,
                BootstrapModule.class
        }
)
public interface BootstrapComponent {

    void inject(BootstrapApplication target);

    void inject(BootstrapAuthenticatorActivity target);

    void inject(BootstrapTimerActivity target);

    void inject(MainActivity target);

    void inject(CheckInsListFragment target);

    void inject(NavigationDrawerFragment target);

    void inject(NewsActivity target);

    void inject(NewsListFragment target);

    void inject(UserActivity target);

    void inject(UserListFragment target);

    void inject(TimerService target);

    void inject(BootstrapFragmentActivity target);
    void inject(BootstrapActivity target);


}
