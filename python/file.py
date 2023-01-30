import os
import dbm

file = open('write.txt', 'w')

line1 = "This here's the wattle, \n"
file.write(line1)

file.close()

print(os.getcwd())
print(os.path.abspath('write.txt'))
print(os.path.exists('write.txt'))
print(os.path.isdir('/Users/naythukhant/Code/uop/python/'))

db = dbm.open('test', 'c')
db['test'] = 'helloworld'
print(db['test'])


fin = open('words.txt')
for line in fin:
    word = line.strip()
    print(word)


test = 'test test'
print(test.strip())


try:
    fin = open('answer.txt')
    fin.write('Yes')
except:
    print('No')
print('Maybe')
