import json
from collections import OrderedDict

filename = "benchmark_report.json"
fileObj = open(filename)
jb = json.load(fileObj, object_pairs_hook=OrderedDict)

def report(name):
    print name
    print "  ", jb["benchmarks"][name]["actions"]["summary"]["avg_aps"], "avg_aps"
    print "  ", jb["benchmarks"][name]["actions"]["summary"]["aps_target_rate"], "aps_target_rate"
    print "  ", jb["benchmarks"][name]["actions"]["summary"]["avg_rt"], "avg_rt"
    print "  ", jb["benchmarks"][name]["actions"]["summary"]["p99_rt"], "p99_rt"
    print "  ", jb["benchmarks"][name]["actions"]["summary"]["max_rt"], "max_rt"
    print "  ", jb["benchmarks"][name]["actions"]["summary"]["CPU_T"], "CPU_T"
    print "  ", jb["benchmarks"][name]["actions"]["summary"]["CPU"], "CPU"

report("Jactl")
report("Groovy")
