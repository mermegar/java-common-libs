package org.opencb.variant.lib.io;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: aaleman
 * Date: 9/13/13
 * Time: 6:09 PM
 * To change this template use File | Settings | File Templates.
 */
public interface DataAnnotator<T> {

    public List<String> annot(List<T> batch);

    public String annot(T elem);
}
