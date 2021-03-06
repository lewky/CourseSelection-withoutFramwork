// Copyright (c) 2018-2018 Lewis.Liu Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION em.1.0.0
// ============================================================================
// CHANGE LOG
// em.1.0.0 : 2018-2-1, Lewis.Liu created
// ============================================================================
package com.em.entity;

import com.em.entity.base.BaseEntity;

/**
 * @author Lewis.Liu
 */
public class Authority extends BaseEntity {

    private static final long serialVersionUID = 6394734060939149358L;

    /**
     * name for authority
     */
    private String name;

    /**
     * code for authority
     */
    private String code;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code
     *            the code to set
     */
    public void setCode(final String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Authority [name=" + name + ", code=" + code + ", " + super.toString() + "]";
    }

}
