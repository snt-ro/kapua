/*******************************************************************************
 * Copyright (c) 2017 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.app.console.module.api.client.ui.widget;

import java.util.Arrays;

import com.extjs.gxt.ui.client.widget.form.SimpleComboBox;
import org.eclipse.kapua.app.console.module.api.shared.model.Enum;

public class EnumComboBox<E extends Enum> extends SimpleComboBox<E> {

    public EnumComboBox() {
        super();

        setEditable(false);
        setTriggerAction(TriggerAction.ALL);
        setAllowBlank(false);
    }

    public void add(E[] values) {
        super.add(Arrays.asList(values));
    }
}
