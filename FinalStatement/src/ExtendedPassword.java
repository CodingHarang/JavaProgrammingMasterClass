public class ExtendedPassword extends Password{
  private int decryptedPasword;

  public ExtendedPassword(int password) {
    super(password);
    this.decryptedPasword = password;
  }

//  @Override
//  public void storePassword() {
//    System.out.println("Saving password as " + this.decryptedPasword);
//  }
}
