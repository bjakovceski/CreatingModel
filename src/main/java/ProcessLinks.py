import sys
import multiprocessing as mp, os

print('Number of arguments:', len(sys.argv), 'arguments.')
print('Argument List:', str(sys.argv))
# link = sys.argv[1]
# print("link to process " + link)

import time
start_time = time.time()
# with open('C:/Users/Jakovcheski/Desktop/cleanLinks_en.ttl', "r",   encoding="utf8") as lines:
#     for line in lines:
#         print(line)
bunchsize = 10000     # Experiment with different sizes
bunch = []
with open("C:/Users/Jakovcheski/Desktop/cleanLinks_en.ttl", "r", encoding="utf8") as r:
    for line in r:
        x, y, z = line.split(' ')[:3]
        bunch.append(line.replace(x,x[:-3]).replace(y,y[:-3]).replace(z,z[:-3]))
        if len(bunch) == bunchsize:
            print(bunch[0])
            bunch = []


        # if(link == line):
        #     print(line)

# import multiprocessing as mp,os
#
# def process_dataline(line):
#     print(line)
#
# def process_wrapper(chunkStart, chunkSize):
#     with open("C:/Users/Jakovcheski/Desktop/cleanLinks_en.ttl", encoding="utf8") as f:
#         f.seek(chunkStart)
#         lines = f.read(chunkSize).splitlines()
#         for line in lines:
#             process_dataline(line)
#
# def chunkify(fname,size=1024*1024):
#     fileEnd = os.path.getsize(fname)
#     with open(fname,'rb') as f:
#         chunkEnd = f.tell()
#         while True:
#             chunkStart = chunkEnd
#             f.seek(size,1)
#             f.readline()
#             chunkEnd = f.tell()
#             yield chunkStart, chunkEnd - chunkStart
#             if chunkEnd > fileEnd:
#                 break
#
# #init objects
# pool = mp.Pool(4)
# jobs = []
#
# #create jobs
# for chunkStart,chunkSize in chunkify("C:/Users/Jakovcheski/Desktop/cleanLinks_en.ttl"):
#     jobs.append( pool.apply_async(process_wrapper,(chunkStart,chunkSize)) )
#
# #wait for all jobs to finish
# for job in jobs:
#     job.get()
#
# #clean up
# pool.close()

print("\ntotal time " + str((time.time()-start_time)))


