package com.smattern.farm.datahandling;

import com.smattern.farm.domain.Farm;

/**
 * Farm data handling.
 *
 * @author Mattern, Sebastian, 24/11/14.
 * package: com.smattern.farm.datahandling.impl
 */
public interface FarmDatahandling {

    /**
     * Persist the farm.
     *
     * @param farm, the current farm
     */
    public void save(Farm farm);

    /**
     * Update the current farm.
     *
     * @param id, the farm id
     */
    public void update(int id);

    /**
     * Delete the current farm.
     *
     * @param farm, the farm to be deleted
     */
    public void delete(Farm farm);

    /**
     * Find farm.
     *
     * @param id, the ide to be find
     */
    public void find(int id);
}
