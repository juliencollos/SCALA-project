//pseudo code pour parser les fichier et lire nos data

def parseFile(line: String): Option[Data] = {
    line.split(";").toList match {
        case List(nos data) => Some(Data(nos data)) //nos data = (id, ident, etc..)
        case _ => None
    }
}

def readDataAirport(fileName: String): List[Data] = {
    val filename = "airport.csv"
    val lines = Source.fromFile(filename).getLines.toList
    val data = parseFile(lines)
}
