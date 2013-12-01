/*
 * This file is a part of Square, Customer Relationship Management Software for insurance's companies
 * Copyright (C) 2010-2012  SCUB <square@scub.net> - Mutuelle SMATIS FRANCE  <square@smatis.fr >
 * 
 * This program is free software; you can redistribute it and/or modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2 of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package com.square.composants.graphiques.lib.client.event;

import com.google.gwt.event.shared.GwtEvent;

/**
 * Evenement sur la fermeture du BlocEnteteDepliant.
 * @author Anthony Guillemette (anthony.guillemette@scub.net) - SCUB
 */
public class CloseBlocSyntheseEvent extends GwtEvent<CloseBlocSyntheseEventHandler> {

    /** Type de l'evenement. */
    public static final Type<CloseBlocSyntheseEventHandler> TYPE = new Type<CloseBlocSyntheseEventHandler>();

    /**
     * Constructeur par defaut.
     */
    public CloseBlocSyntheseEvent() {
        super();
    }

    @Override
    public Type<CloseBlocSyntheseEventHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(CloseBlocSyntheseEventHandler handler) {
        handler.onClose(this);
    }

}
