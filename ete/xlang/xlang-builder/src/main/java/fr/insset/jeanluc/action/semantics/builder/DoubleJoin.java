package fr.insset.jeanluc.action.semantics.builder;

import fr.insset.jeanluc.ete.gel.Step;



/**
 * A simple step in a navigation can match two joins in the database model, in
 * case of intermediate table.<br>
 * The DoubleJoin class is intended to catch the problem.
 *
 * @author jldeleage
 */
public class DoubleJoin extends Join {

    public DoubleJoin(Join firstJoin, Join secondJoin) {
        this.firstJoin = firstJoin;
        this.secondJoin = secondJoin;
    }



    //==========================================================================//

    public Join getFirstJoin() {
        return firstJoin;
    }

    public Join getSecondJoin() {
        return secondJoin;
    }


    //==========================================================================//


    Join            firstJoin, secondJoin;

}

