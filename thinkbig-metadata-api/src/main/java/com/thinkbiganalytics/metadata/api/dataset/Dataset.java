/**
 * 
 */
package com.thinkbiganalytics.metadata.api.dataset;

import java.io.Serializable;

import org.joda.time.DateTime;

/**
 *
 * @author Sean Felten
 */
public interface Dataset {
    
    interface ID extends Serializable {};
    
    ID getId();
    
    String getName();
    
    String getDescription();
    
    DateTime getCreationTime();
    
//    List<ChangeSet<?>> getChangeSets();
    
    // TODO add type/schema/format related properties

}
