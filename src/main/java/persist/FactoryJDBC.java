package persist;

public class FactoryJDBC extends Factory {

	public FactoryJDBC() { }

	@Override
	public UserJDBC createUser() {
		UserJDBC u = new UserJDBC();
		return u;
		//return u.save();
	}

}
