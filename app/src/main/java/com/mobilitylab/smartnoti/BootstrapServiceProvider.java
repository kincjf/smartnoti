package com.mobilitylab.smartnoti;

import android.accounts.AccountsException;
import android.app.Activity;

import com.mobilitylab.smartnoti.core.BootstrapService;

import java.io.IOException;

public interface BootstrapServiceProvider {
    BootstrapService getService(Activity activity) throws IOException, AccountsException;
}
