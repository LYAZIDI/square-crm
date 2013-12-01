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
package com.square.core.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

/**
 * Résultats de l'action.
 * @author straumat - SCUB
 */
@Entity
@Table(name = "DIM_ACTION_NATURE_RESULTAT")
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "ACTION_NATURE_RESULTAT_UID", nullable = false, unique = true)),
@AttributeOverride(name = "version", column = @Column(name = "ACTION_NATURE_RESULTAT_VERSION", unique = false)),
@AttributeOverride(name = "identifiantExterieur", column = @Column(name = "ACTION_NATURE_RESULTAT_EID", unique = true)),
@AttributeOverride(name = "libelle", column = @Column(name = "ACTION_NATURE_RESULTAT_LIB", nullable = false)),
@AttributeOverride(name = "ordre", column = @Column(name = "ACTION_NATURE_RESULTAT_ORDRE", nullable = false)),
@AttributeOverride(name = "visible", column = @Column(name = "ACTION_NATURE_RESULTAT_VISIBLE", nullable = false)) })
public class ActionNatureResultat extends ModelDim {

    /**
     * Nature de l'action.
     */
    @ManyToOne
    @JoinColumn(name = "ACTION_NATURE_UID", nullable = false)
    @ForeignKey(name = "FK_DIM_ACTION_NATURE_RESULTAT_ACTION_NATURE_UID")
    private ActionNature nature;

    /**
     * Getter / Setter de la propriété.
     * @return the nature
     */
    public ActionNature getNature() {
        return this.nature;
    }

    /**
     * Getter / Setter de la propriété.
     * @param nature the nature to set
     */
    public void setNature(ActionNature nature) {
        this.nature = nature;
    }

    /**
     * Serial version UID.
     */
    private static final long serialVersionUID = -4056690595137566530L;

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionNatureResultat)) {
            return false;
        }
        return equalsUtil(other);
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

}
