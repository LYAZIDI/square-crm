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
package com.square.composant.emails.square.client.model;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * DTO GWT représentant les coordonnées d'une personne (email, nom, ...).
 * @author nnadeau - SCUB
 */
public class PersonneEmailModel implements IsSerializable {

    /** Libellé de l'utilisateur. */
    private String libelleUtilisateur;

    /** Email. */
    private String adresseEmail;

    /** Numéro adhérent. */
    private String numeroAdherent;

    /**
     * Get the adresseEmail value.
     * @return the adresseEmail
     */
    public String getAdresseEmail() {
        return adresseEmail;
    }

    /**
     * Set the adresseEmail value.
     * @param adresseEmail the adresseEmail to set
     */
    public void setAdresseEmail(String adresseEmail) {
        this.adresseEmail = adresseEmail;
    }

    /**
     * Get the numeroAdherent value.
     * @return the numeroAdherent
     */
    public String getNumeroAdherent() {
        return numeroAdherent;
    }

    /**
     * Set the numeroAdherent value.
     * @param numeroAdherent the numeroAdherent to set
     */
    public void setNumeroAdherent(String numeroAdherent) {
        this.numeroAdherent = numeroAdherent;
    }

    /**
     * Get the libelleUtilisateur value.
     * @return the libelleUtilisateur
     */
    public String getLibelleUtilisateur() {
        return libelleUtilisateur;
    }

    /**
     * Set the libelleUtilisateur value.
     * @param libelleUtilisateur the libelleUtilisateur to set
     */
    public void setLibelleUtilisateur(String libelleUtilisateur) {
        this.libelleUtilisateur = libelleUtilisateur;
    }
}
