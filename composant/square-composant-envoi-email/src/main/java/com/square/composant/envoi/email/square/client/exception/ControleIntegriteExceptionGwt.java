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
package com.square.composant.envoi.email.square.client.exception;

import org.scub.foundation.framework.gwt.module.client.exception.GwtRunTimeExceptionGwt;

import com.square.composants.graphiques.lib.client.composants.model.RapportModel;

/**
 * Exception levée par les violations des règles métier.
 * @author Nicolas NADEAU (nicolas.nadeau@scub.net) - SCUB
 */
public class ControleIntegriteExceptionGwt extends GwtRunTimeExceptionGwt {

    /** Identifiant de sérialisation. */
    private static final long serialVersionUID = -4351512813027653740L;

    /** Le rapport. */
    private RapportModel rapport;

    /**
     * Constructeur par défaut.
     */
    public ControleIntegriteExceptionGwt() {
        super();
    }

    /**
     * Constructeur avec le rapport.
     * @param rapport le rapport.
     */
    public ControleIntegriteExceptionGwt(RapportModel rapport) {
        this.rapport = rapport;
    }

    /**
     * Retourne la valeur de rapport.
     * @return the rapport
     */
    public RapportModel getRapport() {
        return rapport;
    }
}
