package io.liteglue;

/* package */ interface SQLDatabaseHandle {
  public int open();
  public int close();
  public boolean isOpen();
  public SQLStatementHandle newStatementHandle(String sql);
  public long getLastInsertRowid();
  public int getTotalChanges();
  public String getLastErrorMessage();
}
