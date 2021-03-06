using System;
using System.Collections.Generic;
using System.Text;

namespace QR_Presence.Models.APIModels
{
    public class StartTime
    {
        public int hour { get; set; }
        public int nano { get; set; }
        public int minute { get; set; }
        public int second { get; set; }
    }

    public class NextCours
    {
        public string CourseName { get; set; }
        public int length { get; set; }
        public int startTime { get; set; }
        public string day { get; set; }
        public string STime => $"{startTime}:00";
        public string ETime => $"{startTime + length}:00";

    }

    public class Interval
    {
        public int start_h { get; set; }
        public int length { get; set; }
        public int id_interval { get; set; }
        public string day { get; set; }
        public string STime => $"{start_h}:00";
        public string ETime => $"{start_h + length}:00";

        public string FullName => $"{day[0]} {STime}-{ETime}";
    }

    public class ProfileModel
    {
        public string Group { get; set; }
        public List<NextCours> NextCourses { get; set; }
        public string LDAP { get; set; }
        public string name { get; set; }
        public int id_user { get; set; }
        public string privilege { get; set; }
        public string SecondName { get; set; }
    }

}
