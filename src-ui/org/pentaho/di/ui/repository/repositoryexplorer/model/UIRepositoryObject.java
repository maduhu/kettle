package org.pentaho.di.ui.repository.repositoryexplorer.model;

import java.util.Date;

import org.pentaho.di.repository.ObjectId;
import org.pentaho.di.repository.RepositoryContent;
import org.pentaho.di.repository.RepositoryElement;
import org.pentaho.di.repository.RepositoryObjectType;
import org.pentaho.ui.xul.XulEventSourceAdapter;

public abstract class UIRepositoryObject extends XulEventSourceAdapter {
  
  // This object can be a Directory or a RepositoryContent
  protected RepositoryElement obj;

  public UIRepositoryObject() {
    super();
  }

  public UIRepositoryObject(RepositoryElement obj) {
    super();
    this.obj = obj;
  }
  
  public String getId() {
    return obj.getObjectId().getId();
  }

  public ObjectId getObjectId() {
    return obj.getObjectId();
  }

  public String getName() {
    return obj.getName();
  }
  
  public abstract Date getModifiedDate();

  public abstract String getFormatModifiedDate();

  public abstract String getModifiedUser();

  public abstract RepositoryObjectType getObjectType();

  public abstract String getType();

  public abstract String getDescription();

  public abstract String getLockMessage();
  
  public boolean isDeleted(){
    return false;
  }

}