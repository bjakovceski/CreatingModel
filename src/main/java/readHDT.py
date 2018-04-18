# from itertools import islice
# from hdtconnector.libhdtconnector import HDTConnector
# m_map = HDTConnector("my/path.hdt")
#
# # Read the 10-first elements in the collection
# iter = m_map.search("", "", "")
# for triple in islice(iter, 10):
#     print( triple.get_subject() )
#
# # Specific subset
# resource = "some/interesting/resource"
# iter = m_map.search(resource, "", "")
# for triple in iter:
#     print( triple.get_subject() )
#     print( triple.get_object() )
#     print( triple.get_predicate() )
#
# # Search by Ids
# from hdtconnector.libhdtconnector import triple_role
#
# id = m_map.uri_to_id( resource, triple_role.subject)
# iter = m_map.search_id( id, 0, 0) # 0 means *
# for triple in iter:
#     print( triple.get_object() )

from rdflib import Graph

g = Graph()
g.parse("C:/Users/Jakovcheski/Desktop/cleanLinks_en.ttl", format="nt")

print("graph has %s statements." % len(g))
