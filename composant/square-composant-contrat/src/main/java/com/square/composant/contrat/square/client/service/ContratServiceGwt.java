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
package com.square.composant.contrat.square.client.service;

import org.scub.foundation.framework.gwt.module.client.exception.GwtRunTimeExceptionGwt;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.square.composant.contrat.square.client.model.ContratModel;
import com.square.composant.contrat.square.client.model.InfosContratsBeneficiaireModel;
import com.square.composant.contrat.square.client.model.ListeContratsModel;

/**
 * Interface synchrone des services GWT pour le service des contrats.
 * @author Nicolas NADEAU (nicolas.nadeau@scub.net) - SCUB
 */
@RemoteServiceRelativePath(value = "handler/contratService")
public interface ContratServiceGwt extends RemoteService {

    /**
     * Récupère la liste des contrats d'un adhérent.
     * @param uidPersonne l'identifiant unique de l'adhérent.
     * @return les contrats de l'adhérent.
     * @throws GwtRunTimeExceptionGwt Exception levée à l'exécution par GWT.
     */
    ListeContratsModel getListeContrats(Long uidPersonne) throws GwtRunTimeExceptionGwt;

    /**
     * Récupère les informations d'un contrat.
     * @param uidContrat l'identifiant unique du contrat à récupérer.
     * @return le contrat.
     * @throws GwtRunTimeExceptionGwt Exception levée à l'exécution par GWT.
     */
    ContratModel getContrat(Long uidContrat) throws GwtRunTimeExceptionGwt;

    /**
     * Détermine s'il existe des contrats entre un assuré et un bénéficiaire.
     * @param idAssure l'identifiant de l'assuré.
     * @param idBeneficiaire l'identifiant du bénéficiaire.
     * @return informations calculées sur les contrats entre l'assuré et le bénéficiaire.
     * @throws GwtRunTimeExceptionGwt Exception levée à l'exécution par GWT.
     */
    InfosContratsBeneficiaireModel hasContratAssureBeneficiaire(Long idAssure, Long idBeneficiaire) throws GwtRunTimeExceptionGwt;
}
