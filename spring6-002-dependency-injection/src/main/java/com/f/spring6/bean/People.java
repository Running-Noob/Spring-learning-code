package com.f.spring6.bean;

import java.util.List;
import java.util.Set;

/**
 * @author fzy
 * @date 2024/1/17 20:14
 */
public class People {
    private List<String> names;
    private Set<Address> addrs;

    public void setNames(List<String> names) {
        this.names = names;
    }

    public void setAddrs(Set<Address> addrs) {
        this.addrs = addrs;
    }

    @Override
    public String toString() {
        return "People{" +
                "names=" + names +
                ", addrs=" + addrs +
                '}';
    }
}
