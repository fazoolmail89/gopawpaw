package com.gopawpaw.erp.hibernate.i;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * IpMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.i.IpMstr
 * @author MyEclipse Persistence Tools
 */

public class IpMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(IpMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(IpMstr transientInstance) {
		log.debug("saving IpMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(IpMstr persistentInstance) {
		log.debug("deleting IpMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public IpMstr findById(com.gopawpaw.erp.hibernate.i.IpMstrId id) {
		log.debug("getting IpMstr instance with id: " + id);
		try {
			IpMstr instance = (IpMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.i.IpMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(IpMstr instance) {
		log.debug("finding IpMstr instance by example");
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
		log.debug("finding IpMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from IpMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all IpMstr instances");
		try {
			String queryString = "from IpMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public IpMstr merge(IpMstr detachedInstance) {
		log.debug("merging IpMstr instance");
		try {
			IpMstr result = (IpMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(IpMstr instance) {
		log.debug("attaching dirty IpMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(IpMstr instance) {
		log.debug("attaching clean IpMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IpMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IpMstrDAO) ctx.getBean("IpMstrDAO");
	}
}