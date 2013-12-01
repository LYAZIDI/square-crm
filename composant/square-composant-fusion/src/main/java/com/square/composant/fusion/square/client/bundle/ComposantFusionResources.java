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
package com.square.composant.fusion.square.client.bundle;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.CssResource.NotStrict;

/**
 * Interface des ressources utilisées dans le composant.
 * @author Nicolas NADEAU (nicolas.nadeau@scub.net) - SCUB
 */
public interface ComposantFusionResources extends ClientBundle {

    /**
     * Css.
     * @return le css
     */
    @NotStrict
    @Source({"com/square/composant/fusion/square/public/themes/default/styles/default.css" })
    ComposantFusionCss css();

    /**
     * Bouton pour inverser le sens de la fusion (actif).
     * @return l'image.
     */
    @Source("com/square/composant/fusion/square/public/themes/default/images/btnSensFusionActif.png")
    ImageResource inverserSensFusionActif();

    /**
     * Bouton pour inverser le sens de la fusion (inactif).
     * @return l'image.
     */
    @Source("com/square/composant/fusion/square/public/themes/default/images/btnSensFusionInactif.png")
    ImageResource inverserSensFusionInactif();
}
