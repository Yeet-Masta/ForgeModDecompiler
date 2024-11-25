/*
 * Copyright (c) 2008-2019 Emmanuel Dupuy.
 * This project is distributed under the GPLv3 license.
 * This is a Copyleft license that gives the user the right to use,
 * copy and modify the code freely for non-commercial purposes.
 */

package org.jd.core.v1.api.loader;

import java.io.IOException;

public interface Loader {
    boolean canLoad(String internalName);

    byte[] load(String internalName) throws LoaderException, IOException, org.jd.core.v1.api.loader.LoaderException;
}
