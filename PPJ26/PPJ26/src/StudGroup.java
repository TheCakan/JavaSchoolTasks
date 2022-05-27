public class StudGroup {
    private String groupName;
    private StudNode head = null;

    public StudGroup(String n, StudNode h) {
        groupName = n;
        head = h;
    }

    public StudGroup(String n, Student s) {
        this(n, new StudNode(s));
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String n) {
        groupName = n;
    }

    public void addFront(Student s) {
        StudNode temp = head;
        head = new StudNode(s, temp);
    }

    public void addFront(String name) {
        addFront(new Student(name));
    }

    public void addBack(Student s) {
        StudNode temp = head;
        while(temp.next != null) temp = temp.next;
        temp.next = new StudNode(s);
    }

    public void addBack(String name) {
        Student temp = new Student(name);
        addBack(temp);
    }

    public int count() {
        int counter = 1;
        StudNode temp = head;
        while(temp.next != null) {
            temp = temp.next;
            counter++;
        }
        return counter;
    }

    public boolean isWithID(int id) {
        boolean determ = false;
        StudNode temp = head;
        for (int c = this.count(); c>0; c--) {
            if (temp.getStudent().getId() == id) determ = true;
            temp = temp.next;
        }
        return determ;
    }

    public Student getStudent(int id) {
        StudNode temp = head;
        for (int c = this.count(); c>0; c--) {
            if (temp.getStudent().getId() == id) break;
            temp = temp.next;
        }
        return temp.getStudent();
    }

    public Student[] getStudsWithName(String name) {
        Student[] arr = new Student[this.count()];
        StudNode temp = head;
        for (int c = this.count(), i = 0; c>0; c--) {
            if (temp.getStudent().getName().equalsIgnoreCase(name)) {
                arr[i] = temp.getStudent();
                i++;
            }
            temp = temp.next;
        }
        return arr;
    }

    public void printStudsWithName(String name) {
        boolean anyStudents = false;
        Student[] arr = getStudsWithName(name);
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] != null) anyStudents = true;
        }
        if (anyStudents) {
            System.out.println("Students with the name \"" + name + "\": ");
            for (Student s : arr) {
                if (s==null) continue;
                System.out.println(s + "\n");
            }
        }
        else System.out.println("No students with the name \"" + name + "\"");
    }

    public String toString() {
        String answ = groupName;
        StudNode temp = head;
        for (int c = this.count(); c>0; c--) {
            answ = answ + "\n" + temp.getStudent().toString();
            temp = temp.next;
        }
        return answ;
    }
}
