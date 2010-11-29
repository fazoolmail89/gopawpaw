package com.gopawpaw.erp.hibernate.e;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * EswpfDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.e.EswpfDet
 * @author MyEclipse Persistence Tools
 */

public class EswpfDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(EswpfDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(EswpfDet transientInstance) {
		log.debug("saving EswpfDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EswpfDet persistentInstance) {
		log.debug("deleting EswpfDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EswpfDet findById(com.gopawpaw.erp.hibernate.e.EswpfDetId id) {
		log.debug("getting EswpfDet instance with id: " + id);
		try {
			EswpfDet instance = (EswpfDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.e.EswpfDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EswpfDet instance) {
		log.debug("finding EswpfDet instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding EswpfDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from EswpfDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all EswpfDet instances");
		try {
			String queryString = "from EswpfDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EswpfDet merge(EswpfDet detachedInstance) {
		log.debug("merging EswpfDet instance");
		try {
			EswpfDet result = (EswpfDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EswpfDet instance) {
		log.debug("attaching dirty EswpfDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EswpfDet instance) {
		log.debug("attaching clean EswpfDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EswpfDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EswpfDetDAO) ctx.getBean("EswpfDetDAO");
	}
}