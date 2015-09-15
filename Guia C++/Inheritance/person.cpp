class Person {
public:
  Person (int age, int weight){
    std::cout << "Person constructor ...\n";
    this->age = age;
    this->weight = weight;
  }
  ~Person() {
    std::cout << "Person destructor ...\n";
  }
  // this method is overrided in the drived class
  void showInfo() {
    std::cout << "I am " << age << " years old " ;
    std::cout << "and weighs " << weight << " kilo.\n\n" ;
  }
  // this method is hided
  void showInfo(std::string pname) {
    std::cout << "I am " << pname.c_str()  << " " << age << " years old " ;
    std::cout << "and weighs " << weight << " kilo.\n\n" ;
  }
  int getAge() { return age; }
  int getWeight() { return weight; }
protected:
  int age;
private:
  int weight;
};

class Employee : public Person {
public:
  Employee (int age, int weight, int salary): Person(age,weight){
    std::cout << "Employee constructor ...\n";
    this->salary = salary;
  }
  ~Employee() {
    std::cout << "Employee destructor ...\n";
  }
  // This method override the class method : void showInfo();
  void showInfo() {
    // Drived class can only access protected members in base class
    // as long as Inheritance access specifier is pucblic or protected.
    std::cout << "I am " << age << " years old " ;
    std::cout << "and weighs " << getWeight() << " kilo " ;
    std::cout << "and earns " << salary << " dollar.\n\n" ;
    // access hided method inside the drived class
    Person::showInfo("an Employee");
  }
  int getSalary() { return salary; }
private:
  int salary;
};