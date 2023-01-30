#Part 1

#function to calculate and print the volume of sphere
def print_volume(radius):
    pi = 3.141592653589793 #constant value for pi is 3.141592653589793
    volume = (4/3) * pi * radius ** 3
    print(volume)

print_volume(5)
print_volume(10)
print_volume(15)

from datetime import date
""" Description of the function
    This function needs the name, gender, year of birth, batch and academic year of a student
    and can print the student provided information in pretty format

    When the function is called, it calculates the age first, prepares to print and then print beautifully
test """
def print_student_info(name, gender, yearOfBirth, batch, academicYear):
    age = date.today().year - yearOfBirth
    info = "Name           = "  + name + "\nGender         = "  + gender + "\nAge            = "  + str(age) + "\nBatch          = "  + str(batch) + "\nAcademic Year  = " + str(academicYear) + "\n"
    print('.' * 20)
    print('PRINTING STUDENT INFORMATION')
    print('.' * 20)
    print(info)
    print('.' * 20)
    print('PRINTING COMPLETED')
    print('.' * 20)

print_student_info("NAY THU KHANT", "MALE", 2001, 1, 2022)
print_student_info("NAY THU KHANT 1", "FEMALE", 2002, 2, 2022)
print_student_info("NAY THU KHANT 2", "RATHER NOT TO SAY", 2003, 3, 2022)


