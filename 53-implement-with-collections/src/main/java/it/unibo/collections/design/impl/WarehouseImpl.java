package it.unibo.collections.design.impl;
import it.unibo.collections.design.api.Product;
import it.unibo.collections.design.api.Warehouse;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Implementation of a warehouse.
 *
 */
public class WarehouseImpl implements Warehouse {

    private final Set<Product> set = newSet();

    /**
     * {@inheritDoc}
     */
    @Override
    public final void addProduct(final Product p) {
        this.set.add(p);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Set<String> allNames() {
        final Set<String> s = newSet();
        for (final Product p : this.set) {
            s.add(p.getName());
        }
        return s;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Set<Product> allProducts() {
        return newSetFrom(this.set);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public final boolean containsProduct(final Product p) {
        return set.contains(p);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public final double getQuantity(final String name) {
        for (final var p : this.set) {
            if (p.getName().equals(name)) {
                return p.getQuantity();
            }
        }
        return 0;
    }

    private static <E> Set<E> newSet() {
        return new LinkedHashSet<>();
    }

    private static <E> Set<E> newSetFrom(final Collection<E> origin) {
        return new LinkedHashSet<>(origin);
    }
}
