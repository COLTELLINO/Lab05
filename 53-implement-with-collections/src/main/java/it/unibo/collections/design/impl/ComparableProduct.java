package it.unibo.collections.design.impl;

import it.unibo.collections.design.api.Product;

/**
 *
 */
public class ComparableProduct extends ProductImpl implements Comparable<Product> {

    /**
     * @param name
     *            the product name
     * @param quantity
     *            the product quantity
     */
    public ComparableProduct(final String name, final double quantity) {
        super(name, quantity);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int compareTo(final Product o) {
        return getName().compareTo(o.getName());
    }
}
