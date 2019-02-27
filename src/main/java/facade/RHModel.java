package facade;


import academy.*;
import domain.Candidat;
import utils.PersistenceManager;

import javax.persistence.EntityManager;


/**
 Interface demandee par le client */
public class RHModel extends PersistenceManager {
    
    /** Constructeur */
    public RHModel() throws ClassNotFoundException { init(); }
    
    /** Ajout un nouvel etudiant dans la database */
    public static boolean ajouteCandidat(Candidat c)     { return create(c); }
//
//    /** Ajout un nouvel professeur dans la database */
//    public static boolean ajouteProfesseur(Professeur p) { return create(p); }
//
//    /** Ajout un nouvel cours dans la database */
//    public static boolean ajouterCours(Cours c, boolean isCascading) {
//
//        if (isCascading) {
//            update(c.getCurriculum());
//            update(c.getProfesseur());
//        }
//        create(c);
//        return true;
//    }
//
//    /**     Modifi le cours
//     @param c Cours a mettre a jour
//     @return si ca a reussi
//     */
//    public static Cours changerCours(Cours c) {
//
//        // Modifi les sous-elements
//        c.setCurriculum((Curriculum) update(c.getCurriculum()));
//        c.setProfesseur((Professeur) update(c.getProfesseur()));
//
//        return (Cours) update(c);
//    }
//
//    /**     Change l'etat de l'inscription pour la mettre a INACTIVE
//     @param i incription a modifier
//     @return si ca a reussi
//     */
//    public static Inscription annulerInscription(Inscription i) {
//
//        i.setEtat(Inscription.INACTIVE);
//        return (Inscription) update(i);
//    }
//
//    /**     Supprime un professeur de la base de donnees
//     @param p le professeur a supprimer
//     @return si ca a reussi
//     */
//    public static boolean supprimerProfesseur(Professeur p) {
//
//        return tryToDeleteProfesseur(p);
//    }
//
//    /**     Load un etudiant a partir de la database
//     @param id cle primaire
//     @return objet Etudiant
//     */
//    public static Etudiant loadEtudiant(int id) { return emFactory.createEntityManager().find(Etudiant.class, id); }
//    public static Curriculum loadCurriculum(int id) { return emFactory.createEntityManager().find(Curriculum.class, id); }
//    public static FamilleInstrument loadFamilleInstrument(int id) { return emFactory.createEntityManager().find(FamilleInstrument.class, id); }
//    public static Inscription loadInscription(int id) { return emFactory.createEntityManager().find(Inscription.class, id); }
//    public static Instrument loadInstrument(int id) { return emFactory.createEntityManager().find(Instrument.class, id); }
//    public static Professeur loadProfesseur(int id) { return emFactory.createEntityManager().find(Professeur.class, id); }
//
//    public static Cours loadCours(int id_curriculum, int id_professeur) {
//        return emFactory.createEntityManager().find(Cours.class, new CoursId(id_curriculum,id_professeur));
//    }
//
//    /** Verifie si ca existe dans la base de donnees
//     @param id id de l'etudiant
//     @return si l'etudiant existe dans la DB
//     */
//    public static boolean etudiantExist(int id) { return emFactory.createEntityManager().find(Etudiant.class, id) != null; }
//
//    /**      Essaye de supprimer un objet dans la DB */
//    public static boolean tryToDeleteProfesseur(Professeur prof) {
//
//        EntityManager em = emFactory.createEntityManager();
//        em.getTransaction().begin();
//        prof = em.find(Professeur.class, ((Professeur) prof).getId());
//        em.remove(prof);
//
//        return commit(em);
//    }
    
}