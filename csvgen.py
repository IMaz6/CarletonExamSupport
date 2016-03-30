import random
import sys
n = int(sys.argv[1])

courses   = ["AERO", "AFRI", "ASLA", "ANTH", "ALDS", "ARAB", "ARCH", "ARCC", "ARCU", "ARCN", "ARCS", "ARTH", "BIOC", "BIOL", "BUSI", "CDNS", "CIED", "CHEM", "CHST", "CHIN", "CIVE", "CLCV", "COOP", "CGSC", "CCDP", "COMM", "CMPS", "COMP", "CRCJ", "DIGH", "DBST", "ERTH", "ECON", "ELEC", "ECOR", "ENGL", "ESLA", "ENVE", "ENSC", "ENST", "EURR", "FILM", "FYSM", "FOOD", "FREN", "FINS", "GEOG", "GEOM", "GERM", "GINS", "GPOL", "GREK", "HLTH", "HEBR", "HIST", "HUMR", "HUMS", "INDG", "IDES", "BIT", "IMD", "NET", "PLT", "INSC", "IPAF", "ISCI", "DIST", "INAF", "ITAL", "JAPA", "JOUR", "LANG", "LATN", "LACS", "LAWS", "LING", "MATH", "MECH", "MAAE", "MEMS", "MGDS", "MUSI", "NSCI", "NEUR", "PHIL", "PHYS", "POLM", "PSCI", "PORT", "PSYC", "PAPM", "PADM", "RELI", "RUSS", "SXST", "SOWK", "SOCI", "SAST", "SPAN", "STAT", "SREE", "SYSC", "TSES", "WGST"]
codes     = ['4201', '3010', '3610', '4602', '2607', '3001', '5101', '3003', '4202', '3303', '4120', '5001', '4601', '2006', '3020', '4107', '4806', '2001', '4805', '1406', '4105', '4505', '4005', '1606', '4102', '1006', '4995', '3101', '3120', '4917', '4106', '3007', '1004', '4700', '3203', '4507', '3801', '4502', '4906', '3601', '4907', '2500', '4604', '3999', '4203', '2002', '4205', '4701', '3600', '4405', '4800', '1101', '3605', '3501', '4927', '1104', '2100', '1005', '3705', '4937', '3006', '3500', '2300', '2004', '1405', '1001', '2401', '2402', '3110', '4607', '3503', '4001', '3004', '4504', '3000', '2404', '4500', '4004', '2101', '2003', '1100', '3100', '2605', '2507', '4600', '3502', '1102', '4101', '3200']
sections  = ["A", "B", "C", "D", "E"]
times     = ["0900", "1400", "1900"]
durations = ["3.00", "2.50", "2.00", "1.50", "1.00"]
locations = ["FH", "AT", "TB", "UC"]
enrolled  = range(10, 500)


for i in range(n):
    line = "{:<8}{:<16}{:<8}{:<16}{:<8}{:<8}{:<3}{:<13}{:<8}{:<8}{:<8}{:<16}{:<16}".format(
        random.choice(courses),
        random.choice(courses) + random.choice(codes),
        random.choice(sections),
        "{}/{}/{}".format(random.choice([str(i).zfill(2) for i in range(12)]), random.choice([str(i).zfill(2) for i in range(30)]), random.choice([str(i).zfill(2) for i in range(15, 16)])),
        random.choice(times),
        random.choice(durations),
        random.choice(locations),
        random.randint(100, 400),
        random.randint(1, 30),
        random.randint(1, 30),
        random.choice(enrolled),
        random.randint(100880000, 100899999),
        random.randint(100880000, 100899999))
        
    #print line 
    print ",".join([s.strip() for s in line.split()])