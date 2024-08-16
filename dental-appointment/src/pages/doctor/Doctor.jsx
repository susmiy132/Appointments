import React, { useState } from 'react'
import { data } from '../../components/doctors/Doctors'
import { useParams } from 'react-router-dom'
import AppointForm from '../../components/appointForm/AppointForm'
import { useDispatch } from 'react-redux'
import { setLogin } from '../../features/login/loginSlice'
import { user } from '../../components/navabar/Navbar'
const Doctor = () => {
  const [showAppoint, setShowAppoint] = useState(false)
  const { id } = useParams()
  const doctor = data.find(doctor => doctor.id == id)
  const dispatch = useDispatch()
  return (
    <section className='w-full py-4 md:px-20 px-2 min-h-screen my-4 relative'>
      <div className='w-full flex justify-between flex-wrap gap-2'>
        <div className='md:w-1/2 w-full h-[650px] rounded overflow-hidden'>
          <img className='w-full h-full object-cover' src={doctor.avatar} alt={doctor.fullName} />
        </div>
        <div className='md:w-[47%] w-full'>
          <div>
            <h2 className='text-left text-3xl md:text-5xl font-semibold text-[#013A65] capitalize'>{doctor.fullName}</h2>
          </div>
          <div className='mt-4'>
            <p className='text-lg text-gray-500 font-medium text-justify first-letter:uppercase'>{doctor.about}</p>
          </div>
          <div className='mt-4 text-gray-600 text-xl font-medium py-4 capitalize'>
            <span className='font-bold'>Speciality: </span> {doctor.specialist}
          </div>
          <hr />
          <div className='mt-4 text-gray-600 text-xl font-medium py-4 capitalize'>
            <span className='font-bold'>Degree: </span> {doctor.degree}
          </div>
          <hr />
          <div className='mt-4 text-gray-600 text-xl font-medium py-4 capitalize'>
            <span className='font-bold'>Training: </span> {doctor.training}
          </div>
          <hr />
          <div className='mt-4 text-gray-600 text-xl font-medium py-4 capitalize'>
            <span className='font-bold'>Working Days: </span> {doctor.workingDays}
          </div>
          <hr />
          <div className='mt-4 text-gray-600 text-lg  font-medium py-4 capitalize'>
            <button className='px-4 py-1 border border-[#00BCD5] text-[#00BCD5] hover:bg-[#00BCD5] hover:text-[#f3f3f3] rounded transition-all delay-75'
              onClick={(e) => {
                if (!user) {
                  dispatch(setLogin(true))
                }
                setShowAppoint(prev => !prev)
                window.scrollTo(0, 0);
              }}
            >Book Now</button>
          </div>
        </div>
      </div>
      {
        showAppoint && <AppointForm d_id={doctor.id} setShowAppoint={setShowAppoint} />
      }
    </section>
  )
}

export default Doctor