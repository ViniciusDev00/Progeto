// Interface Observer
interface Observer {
    void update(String message);
}

// Classe ConcreteObserver
class User implements Observer {
    private String name;
    
    public User(String name) {
        this.name = name;
    }
    
    @Override
    public void update(String message) {
        System.out.println(name + " recebeu a notificação: " + message);
    }
}

// Classe Subject
class Profile {
    private List<Observer> followers = new ArrayList<>();
    
    public void addFollower(Observer observer) {
        followers.add(observer);
    }
    
    public void postPhoto(String message) {
        for (Observer follower : followers) {
            follower.update(message);
        }
    }
}

// Uso
public class Main {
    public static void main(String[] args) {
        Profile profile = new Profile();
        User user1 = new User("Alice");
        User user2 = new User("Bob");
        
        profile.addFollower(user1);
        profile.addFollower(user2);
        
        profile.postPhoto("Nova foto publicada!");
    }
}