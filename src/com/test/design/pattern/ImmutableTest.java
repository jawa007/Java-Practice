package com.test.design.pattern;

class User
{
  private String userName;
  private String userID;
  private int userNode;

  User(String name, int node)
  {
    userName = name;
    userNode = node;
  }
  public void setUserName(String name)
  {
    userName = name;
  }
  public void setUserID(String userid)
  {
    userID = userid;
  }
  public void setUserNode(int node)
  {
    userNode = node;
  }
  public String userName()
  {
    return userName;
  }
}

final class DiskDriveInfo
{
  private int driveSize;
  private String volumeLabel;
  private User driveShare;

  DiskDriveInfo(int size, String volLabel, User share)
  {
    driveSize = size;
    volumeLabel = volLabel;
    driveShare = share;
  }
  public int size()
  {
    return driveSize;
  }
  public String label()
  {
    return volumeLabel;
  }
  public User share()
  {
    return driveShare;
  }
}

public class ImmutableTest {

}
