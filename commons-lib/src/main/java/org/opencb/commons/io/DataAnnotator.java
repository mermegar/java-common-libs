package org.opencb.commons.io;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: aaleman
 * Date: 9/13/13
 * Time: 6:09 PM
 * To change this template use File | Settings | File Templates.
 */
public interface DataAnnotator<T> {

    void annot(List<T> batch);

    void annot(T elem);
}
