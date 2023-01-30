def invert_dict(dictionary):
    inverted_dictionary = dict()
    for key in dictionary:
        for element in dictionary[key]:             #since the element is list here, we will iterate every loop, check the key on inverted_dictionary if it already exists
            if not element in inverted_dictionary:
                inverted_dictionary[element] = [key]    #if not exists, create new key with the value of list
            else:
                inverted_dictionary[element].append(key) #if exists, append the key into the existing list
    return inverted_dictionary


def read_file(file_name, separator , values_separator):
    print('>>> Reading the input file ...')

    try:
        file = open(file_name)
        original_dict = dict()

        for line in file:
            line = line.strip().split(separator)
            if(len(line) > 1):
                key = line[0]
                values = line[1].split(values_separator)
                original_dict[key] = values
            else:
                print('   >>> Found invalid line and skipped')
        print('   >>> Reading input file completed ...')
        return original_dict
    except Exception as exception:
        print('Something went wrong in reading file, the error detail is as follow')
        print(exception)
        exit()



def write_file(inverted_dictionary, output_file_name, separator, values_separator):
    print('>>> Writing the output file ...')
    try:
        file = open(output_file_name, 'w')

        for key, values in inverted_dictionary.items():
            key = key.strip()
            text = key + separator + values_separator.join(values) + '\n'
            file.write(text)
        print('   >>> Writing output file completed')
    except Exception as exception:
        print('Something went wrong in reading file, the error details is as follow')
        print(exception)
        exit()

def read_and_process_file(file_name, output_file_name , separator = ':', values_separator = ','):
    original_dict = read_file(file_name, separator, values_separator)
    inverted_dictionary = invert_dict(original_dict)
    write_file(inverted_dictionary, output_file_name, separator, values_separator)


read_and_process_file('learning-journal-unit-8.txt', 'learning-journal-unit-8-output.txt')

""" I chose to format the input file and output in the following way.

Each line of the input file will have to be in following format.
Format -
group separator members(can be separated with a custom separator)

Example -
uppercases:A,B,C

uppercases is the name of group, : is the separator and A,B,C is
the values here (separator for values here is ',')


For the output file, the format will be still the same. But with
different composition.
Format -
member separator groups

Example -
B:uppercases,mixedcases

B is the member of group uppercases and lowercases. separator here is ':' and the separator for values here is ','
"""


